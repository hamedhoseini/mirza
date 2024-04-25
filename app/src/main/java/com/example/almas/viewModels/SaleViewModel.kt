package com.example.almas.viewModels

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.almas.data.model.Kala
import com.example.almas.data.model.Moshtari
import com.example.almas.data.model.SahebKala
import com.example.almas.data.repository.MirzaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SaleViewModel @Inject constructor(
    private val mirzaRepository: MirzaRepository,
) : ViewModel() {

    private val _productsList = MutableLiveData<List<Kala>>()
    val productsList by lazy { _productsList }

    private val _sahebKalaList = MutableLiveData<List<SahebKala>>()
    val sahebKalaList by lazy { _sahebKalaList }

    private val _moshtariList = MutableLiveData<List<Moshtari>>()
    val moshtariList by lazy { _moshtariList }


    //    private val _searchText = MutableStateFlow("")
//    val searchText = _searchText.asStateFlow()
//
//
    init {
        getAllKala()
        getAllMoshtari()
        getAllSahebKala()
    }
//
    fun getAllKala() {
        viewModelScope.launch {
            try {
                val productListFromApi = mirzaRepository.getAllKala()
                _productsList.value = productListFromApi


            } catch (exception: Exception) {

            }
        }
    }

    fun getAllSahebKala() {
        viewModelScope.launch {
            try {
                val sahebKalaListFromApi = mirzaRepository.getAllSahebKala()
                _sahebKalaList.value = sahebKalaListFromApi


            } catch (exception: Exception) {
            }
        }
    }

    fun getAllMoshtari() {
        viewModelScope.launch {
            try {
                val moshtariListFromApi = mirzaRepository.getAllMoshtari()
                _moshtariList.value = moshtariListFromApi


            } catch (exception: Exception) {
            }
        }
    }
}
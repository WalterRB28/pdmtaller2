package com.pdmtaller2.RamirezBarrera_00018523.ui.screens.RestaurantList

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pdmtaller2.RamirezBarrera_00018523.data.model.Restaurant
import com.pdmtaller2.RamirezBarrera_00018523.data.repository.Restaurant.RestaurantRepository
import com.pdmtaller2.RamirezBarrera_00018523.data.repository.Restaurant.RestaurantRepositoryImpl
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class RestaurantListViewModel : ViewModel() {
    private val restaurantRepository: RestaurantRepository = RestaurantRepositoryImpl()

    private val _restaurants = MutableStateFlow<List<Restaurant>>(emptyList())
    val restaurants: StateFlow<List<Restaurant>> = _restaurants

    private val _loading = MutableStateFlow(false)
    val loading: StateFlow<Boolean> = _loading

    fun loadRestaurants() {
        viewModelScope.launch {
            _loading.value = true
            _restaurants.value = restaurantRepository.getRestaurants()
            _loading.value = false
        }
    }
}

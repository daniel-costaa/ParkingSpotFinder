package com.example.parkingspotfinder.presentation

import com.google.maps.android.compose.MapProperties
import com.example.parkingspotfinder.domain.model.ParkingSpot

data class MapState(
    val properties: MapProperties = MapProperties(),
    val parkingSpots: List<ParkingSpot> = emptyList(),
    val isFalloutMap: Boolean = false
)

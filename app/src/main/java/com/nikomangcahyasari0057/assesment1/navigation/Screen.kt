package com.nikomangcahyasari0057.assesment1.navigation

sealed class Screen (val route: String) {
    data object Home: Screen("mainScreen")
}

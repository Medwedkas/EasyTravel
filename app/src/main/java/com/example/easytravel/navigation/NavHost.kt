package com.example.easytravel.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.easytravel.screens.*

sealed class NavRoute(val route: String) {
    object Authentication : NavRoute("auth_screen")
    object Search : NavRoute("search_screen")
    object Booking : NavRoute("booking_screen")
    object Help : NavRoute("help_screen")
    object Settings : NavRoute("settings_screen")
}

@Composable
fun NavigationHost() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoute.Authentication.route) {
        composable(NavRoute.Authentication.route) { Authentication(navController = navController) }
        composable(NavRoute.Search.route) { Search(navController = navController) }
        composable(NavRoute.Booking.route) { Booking(navController = navController) }
        composable(NavRoute.Help.route) { Help(navController = navController) }
        composable(NavRoute.Settings.route) { Settings(navController = navController) }
    }
}
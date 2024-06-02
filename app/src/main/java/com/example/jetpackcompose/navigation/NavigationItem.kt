package com.example.jetpackcompose.navigation

/*** Created by
Harsha Devnani
 ***/

sealed class NavigationItem (val route:String) {

    object HomeScreen:NavigationItem("Home")
    object DetailScreen:NavigationItem("Details")

}
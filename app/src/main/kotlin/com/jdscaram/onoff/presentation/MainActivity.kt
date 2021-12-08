package com.jdscaram.onoff.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import com.bodeslab.onoff.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fullscreen)
        setupNavigation()
    }

    override fun onSupportNavigateUp() =
        Navigation.findNavController(findViewById(R.id.mainNavigationFragment)).navigateUp()

    private fun setupNavigation() {
        val navController = Navigation.findNavController(findViewById(R.id.mainNavigationFragment))
        val appBarConfiguration = AppBarConfiguration(
            setOf(R.id.main_graph, R.id.home_graph)
        )
        NavigationUI.navigateUp(navController, appBarConfiguration)
    }
}
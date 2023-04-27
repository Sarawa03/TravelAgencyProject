package com.sara.travelagencyapp.ui.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import com.sara.travelagencyapp.R
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(): ViewModel(){


    fun replaceFragment(originFragment: Fragment, destinationFragment: Fragment, bundle: Bundle){
        val fragmentManager = originFragment.requireActivity().supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        destinationFragment.arguments = bundle
        fragmentTransaction.replace(R.id.nav_host_fragment, destinationFragment)
        fragmentTransaction.commit()
    }
}
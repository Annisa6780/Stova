package com.infinitelearning.stovaapp.ui.profil

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.infinitelearning.stovaapp.R

class profil_homeFragment : Fragment() {

    companion object {
        fun newInstance() = profil_homeFragment()
    }

    private lateinit var viewModel: ProfilHomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profil_home, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProfilHomeViewModel::class.java)
        // TODO: Use the ViewModel
    }

}
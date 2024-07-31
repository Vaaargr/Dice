package com.iushin.dice.diceTable.presentation.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.iushin.dice.R
import com.iushin.dice.databinding.DiceTableFragmentBinding

class DiceTableFragment : Fragment() {
    private var _binding: DiceTableFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DiceTableFragmentBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.toRollSettings.setOnClickListener {
            findNavController().navigate(R.id.action_diceTableFragment_to_rollSettingsFragment)
        }

        binding.toGlobalSettings.setOnClickListener {
            findNavController().navigate(R.id.action_diceTableFragment_to_globalSettingsFragment)
        }
    }
}
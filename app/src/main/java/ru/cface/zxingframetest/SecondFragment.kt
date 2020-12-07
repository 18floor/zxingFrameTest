package ru.cface.zxingframetest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.google.zxing.integration.android.IntentIntegrator
import kotlinx.android.synthetic.main.fragment_second.*
import ru.cface.zxingframetest.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val binding = FragmentSecondBinding.inflate(
            inflater,
            container,
            false
        )


        binding.fabSecond.setOnClickListener {
            IntentIntegrator(activity)
                .setBeepEnabled(true)
                .setCameraId(0)
                .setPrompt("SCAN")
                .setBarcodeImageEnabled(true)
                .setOrientationLocked(false)
                .initiateScan()
        }

        binding.buttonSecond.setOnClickListener {
            findNavController().navigate(R.id.action_SecondFragment_to_FirstFragment)
        }

        return binding.root

    }




}
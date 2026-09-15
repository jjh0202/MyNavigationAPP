package com.jeiu.mynavigationapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.jeiu.mynavigationapp.databinding.FragmentCartBinding

class CartFragment : Fragment() {

    private var _binding: FragmentCartBinding? = null
    private val binding
        get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCartBinding.inflate(
            inflater, container, false
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val menuName = arguments?.getString("menuName") ?: "선택없음"
        val price = arguments?.getString("price") ?: "0"
        binding.txtCartMenuName.text = "메뉴명: $menuName"
        binding.txtCartPrice.text = "가격: ${price}원"

        binding.btnCartBack.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.btnOrder.setOnClickListener {
            findNavController().navigate(
                R.id.action_cartFragment_to_orderCompleteFragment
            )
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}

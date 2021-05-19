package ec.edu.ups.congreso

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import ec.edu.ups.congreso.databinding.FragmentLoginBinding


class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_login,
            container, false
        )

        binding.buttonNavLogin.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
        }

        binding.buttonNavRegister.setOnClickListener { view: View ->
            view.findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }


        return binding.root
    }

}
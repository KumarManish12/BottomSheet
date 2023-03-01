package com.example.bottomsheet

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.bottomsheet.databinding.ActivityMainBinding
import com.example.bottomsheet.databinding.BottomSheetLayoutBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnchangename.setOnClickListener {
            val dialogLayoutBinding=BottomSheetLayoutBinding.inflate(layoutInflater)
            val bottomSheetDialog= BottomSheetDialog(this)
            bottomSheetDialog.setContentView(dialogLayoutBinding.root)
            dialogLayoutBinding.btnsubmit.setOnClickListener {
                if (dialogLayoutBinding.etentername.text.toString().isEmpty()){
                    dialogLayoutBinding.etentername.error="enter name"
                }
                else{
                    binding.tvthere.setText(dialogLayoutBinding.etentername.text.toString())
                }
            }
            bottomSheetDialog.show()
        }
    }
}
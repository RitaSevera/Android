package com.example.exercicios

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.exercicios.databinding.ActivityMainBinding

//aqui é onde programo todos os eventos e lógica

class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        /*binding.buttonOla.setOnClickListener {
            var nome: String = binding.editNome.text.toString()
            binding.textResultado.text = "Olá $nome"
        }*/

        /*binding.buttonConverter.setOnClickListener {
            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            var taxa: Double = 1.09
            var dolares: Double = euros*taxa
            dolares = String.format("%.2f", dolares).toDouble() //precisão de dois decimais

            binding.textValorDolares.text = "$dolares $"
        }*/

        /*binding.buttonConversorDolar.setOnClickListener {
            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            var taxaDolar: Double = 1.20
            var dolares: Double = euros*taxaDolar

            dolares = String.format("%.2f", dolares).toDouble()
            binding.textValorConvertido.text = "$dolares $"

            val toast = Toast.makeText(this, "$dolares $", Toast.LENGTH_SHORT) //vai aparecer o que está na variável dolares
            toast.show(); //mensagem temporária que vai aparecer na aplicação, neste caso, por pouco tempo
        }

        binding.buttonConversorReal.setOnClickListener {
            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            var taxaReais: Double = 4.4
            var reais: Double = euros*taxaReais

            reais = String.format("%.2f", reais).toDouble()
            binding.textValorConvertido.text = "$reais R$"

            val toast = Toast.makeText(this, "$reais R$", Toast.LENGTH_SHORT)
            toast.show();
        }

        binding.buttonConversorPeso.setOnClickListener {
            var euros: Double = binding.editValorEuros.text.toString().toDouble()
            var taxaPeso: Double = 31.5
            var peso: Double = euros*taxaPeso

            peso = String.format("%.2f", peso).toDouble()
            binding.textValorConvertido.text = "$peso $"

            val toast = Toast.makeText(this, "$peso $", Toast.LENGTH_SHORT)
            toast.show();
        }*/

        binding.buttonLogin.setOnClickListener {

            var username: String = binding.editUser.text.toString()
            var password: String = binding.editPass.text.toString()

            if (username.equals("user") && password.equals("pass")) {
                Toast.makeText(applicationContext, "Login Válido", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, MainActivity2::class.java))
            } else { //Login Inválido
                Toast.makeText(applicationContext, "Login Inválido", Toast.LENGTH_SHORT).show()
            }

            binding.editUser.text.clear()
            binding.editPass.text.clear()
        }
    }
}
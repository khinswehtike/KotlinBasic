package com.example.quizapp


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.quizapp.databinding.FragmentGameBinding

/**
 * A simple [Fragment] subclass.
 */
data class Question(val text:String,val answer:List<String>)
class GameFragment : Fragment() {
    private var question: MutableList<Question> = mutableListOf(
        Question(text = "What is Android Developer Jetpack?",
            answer = listOf("All of these","Tools","Documentation","Library")),
                Question(text = "What is the base class for layout?",
    answer = listOf("View Groups","ViewSet","ViewCollection","Library")),
        Question(text = "What layout do you for complex screens?",
            answer = listOf("ConstraintLayout","GridLayout","LinearLayout","RelativeLayout")),
        Question(text = "What do you use to push structureed data into layout?",
            answer = listOf("DataBinding","DataPushing","SetText","OnClick Method")),
        Question(text = "What is the build system for android",
            answer = listOf("Gradle","Groyle","maven","Ants")),
        Question(text = "Which one of these is Android Navigation component?",
            answer = listOf("NavController","NavSwitch","NavCentral","NavMaster"))
    )
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_game, container, false)
        val binding=DataBindingUtil.inflate<FragmentGameBinding>(
            inflater,R.layout.fragment_game,container,false
        )
        return binding.root
    }


}

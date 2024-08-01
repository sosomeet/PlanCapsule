package plan.capsule.ui.on_boarding

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import plan.capsule.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    val binding by lazy { ActivityRegisterBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener {
            // TODO: Send credential to server -> fetch result -> return result to the OnboardingActivity
            val intent = Intent(this, OnboardingSelectionFragment::class.java)
            intent.apply {
                putExtra(OnboardingSelectionFragment.STRING_INTENT_KEY, "SOME_TOKEN")
            }

            setResult(Activity.RESULT_OK, intent)
            if (!isFinishing) finish()
        }
    }
}
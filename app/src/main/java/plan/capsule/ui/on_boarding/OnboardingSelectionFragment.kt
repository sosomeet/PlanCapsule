package plan.capsule.ui.on_boarding

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.contract.ActivityResultContracts
import plan.capsule.BaseFragment
import plan.capsule.OnboardingActivity
import plan.capsule.databinding.FragmentOnboardingSelectionBinding

class OnboardingSelectionFragment : BaseFragment<FragmentOnboardingSelectionBinding>(FragmentOnboardingSelectionBinding::inflate) {
    companion object {
        const val STRING_INTENT_KEY: String = "login_result_key"
    }

    private val getResult = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
        result -> if (result.resultCode == Activity.RESULT_OK) {
            // TODO:
            val returnString = result.data?.getStringExtra(STRING_INTENT_KEY)
            Log.d("PlanCapsule", "Return: $returnString")

            (activity as OnboardingActivity).selectPage(1)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonLogin.setOnClickListener {
            getResult.launch(Intent(context, LoginActivity::class.java))
        }
        binding.buttonSignUp.setOnClickListener {
            getResult.launch(Intent(context, RegisterActivity::class.java))
        }
    }
}
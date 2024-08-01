package plan.capsule.ui.on_boarding

import android.content.Intent
import android.os.Bundle
import android.view.View
import plan.capsule.BaseFragment
import plan.capsule.MainActivity
import plan.capsule.databinding.FragmentOnboardingStartTutorialBinding

class StartTutorialFragment : BaseFragment<FragmentOnboardingStartTutorialBinding>(FragmentOnboardingStartTutorialBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP)
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
        }
    }
}
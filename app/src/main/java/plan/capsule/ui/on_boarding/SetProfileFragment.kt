package plan.capsule.ui.on_boarding

import android.os.Bundle
import android.view.View
import plan.capsule.BaseFragment
import plan.capsule.OnboardingActivity
import plan.capsule.databinding.FragmentOnboardingSetProfileBinding

class SetProfileFragment : BaseFragment<FragmentOnboardingSetProfileBinding>(FragmentOnboardingSetProfileBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnNext.setOnClickListener {
            (activity as OnboardingActivity).selectPage(2)
        }
    }
}
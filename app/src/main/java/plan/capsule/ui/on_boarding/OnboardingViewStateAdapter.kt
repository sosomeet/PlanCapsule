package plan.capsule.ui.on_boarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class OnboardingViewStateAdapter(activity: FragmentActivity?): FragmentStateAdapter(activity!!) {
    override fun getItemCount(): Int = 3

    override fun createFragment(p0: Int): Fragment {
        return when (p0) {
            0 -> OnboardingSelectionFragment()
            1 -> SetProfileFragment()
            else -> StartTutorialFragment()
        }
    }

}
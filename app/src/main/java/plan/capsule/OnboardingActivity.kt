package plan.capsule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import plan.capsule.databinding.ActivityOnboardingBinding
import plan.capsule.ui.on_boarding.OnboardingViewStateAdapter

class OnboardingActivity: AppCompatActivity() {
    private val binding by lazy { ActivityOnboardingBinding.inflate(layoutInflater) }

    fun selectPage(page: Int) {
        binding.viewPager.currentItem = page
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.apply {
            viewPager.apply {
                adapter = OnboardingViewStateAdapter(this@OnboardingActivity)
                offscreenPageLimit = 3
                isUserInputEnabled = true // TODO: set this to false on release
            }
            dotsIndicator.attachTo(viewPager)
        }
    }
}
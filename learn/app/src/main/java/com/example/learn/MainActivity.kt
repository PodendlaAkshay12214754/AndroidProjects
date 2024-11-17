import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.learn.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Reference each image button
        val btnPortfolio1 = findViewById<ImageButton>(R.id.btnPortfolio1)
        val btnPortfolio2 = findViewById<ImageButton>(R.id.btnPortfolio2)
        val btnPortfolio3 = findViewById<ImageButton>(R.id.btnPortfolio3)
        val btnPortfolio4 = findViewById<ImageButton>(R.id.btnPortfolio4)

        // Set up click listeners for each button
        btnPortfolio1.setOnClickListener {
            openPortfolioLink("https://example.com/portfolio1")
        }

        btnPortfolio2.setOnClickListener {
            openPortfolioLink("https://example.com/portfolio2")
        }

        btnPortfolio3.setOnClickListener {
            openPortfolioLink("https://example.com/portfolio3")
        }

        btnPortfolio4.setOnClickListener {
            openPortfolioLink("https://example.com/portfolio4")
        }
    }

    // Helper function to open a browser link
    private fun openPortfolioLink(url: String) {
        val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
        startActivity(browserIntent)
    }

    // Inflate the menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    // Handle menu item clicks
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_email -> {
                Toast.makeText(this, "Email Selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_contact -> {
                Toast.makeText(this, "Contact Selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_about -> {
                Toast.makeText(this, "About Us Selected", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.action_settings -> {
                Toast.makeText(this, "Settings Selected", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}

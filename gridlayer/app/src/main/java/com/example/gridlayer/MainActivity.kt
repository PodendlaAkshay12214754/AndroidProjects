package com.example.gridlayer

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Declare variables for UI components
    private lateinit var checkBoxAlooTikki: CheckBox
    private lateinit var checkBoxChicken: CheckBox
    private lateinit var checkBoxPaneerTikki: CheckBox
    private lateinit var checkBoxMushroomTikki: CheckBox
    private lateinit var radioButtonTakeAway: RadioButton
    private lateinit var radioButtonDoorDelivery: RadioButton
    private lateinit var bookNowButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  // Link to your layout file

        // Initialize the views with their corresponding IDs from the XML layout
        checkBoxAlooTikki = findViewById(R.id.b1)  // Replace with correct ID from XML
        checkBoxChicken = findViewById(R.id.b2)    // Replace with correct ID from XML
        checkBoxPaneerTikki = findViewById(R.id.b3) // Replace with correct ID from XML
        checkBoxMushroomTikki = findViewById(R.id.b4) // Replace with correct ID from XML
        radioButtonTakeAway = findViewById(R.id.b6)   // Replace with correct ID from XML
        radioButtonDoorDelivery = findViewById(R.id.b7) // Replace with correct ID from XML
        bookNowButton = findViewById(R.id.b8)        // Replace with correct ID from XML

        // Set OnClickListener for "Book Now" button
        bookNowButton.setOnClickListener {
            handleBooking()
        }
    }

    // Function to handle the booking process and display a confirmation pop-up
    private fun handleBooking() {
        val selectedItems = StringBuilder("Selected Items:\n")

        // Add selected burgers to the list
        if (checkBoxAlooTikki.isChecked) {
            selectedItems.append("Aloo Tikki\n")
        }
        if (checkBoxChicken.isChecked) {
            selectedItems.append("Chicken\n")
        }
        if (checkBoxPaneerTikki.isChecked) {
            selectedItems.append("Paneer Tikki\n")
        }
        if (checkBoxMushroomTikki.isChecked) {
            selectedItems.append("Mushroom Tikki\n")
        }

        // Ensure at least one checkbox is selected
        if (selectedItems.toString() == "Selected Items:\n") {
            Toast.makeText(this, "Please select at least one item", Toast.LENGTH_SHORT).show()
            return
        }

        // Determine the delivery type
        val deliveryType = when {
            radioButtonTakeAway.isChecked -> "Take Away"
            radioButtonDoorDelivery.isChecked -> "Door Delivery"
            else -> {
                Toast.makeText(this, "Please select a delivery type", Toast.LENGTH_SHORT).show()
                return
            }
        }

        // Add the delivery type to the message
        selectedItems.append("\nDelivery Type: $deliveryType")

        // Show the confirmation dialog
        AlertDialog.Builder(this)
            .setTitle("Booking Successful")
            .setMessage(selectedItems.toString())
            .setPositiveButton("OK", null)
            .show()
    }
}
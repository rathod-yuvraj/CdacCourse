
        const nameInput = document.getElementById("fname");
        const cityInput = document.getElementById("fcity");
        const ageInput = document.getElementById("fage");
        const tableBody = document.querySelector("#tableBody tbody");
        const submitButton = document.querySelector("button[type='button']");

        let editBtn = null; // Keeping this variable for potential future edit functionality

        /**
         * Clears the input fields in the form.
         */
        function clearFields() {
            nameInput.value = "";
            cityInput.value = "";
            ageInput.value = "";
        }

        /**
         * Displays the data from the form in a new table row.
         */
        function displayData() {
            const name = nameInput.value.trim();
            const city = cityInput.value.trim();
            const age = ageInput.value.trim(); // age is validated by 'required' and 'type="number"'

            // Basic validation check
            if (!name || !city || !age) {
                alert("Please fill all fields!");
                return; // Stop the function if validation fails
            }

            // 1. Create a new table row (<tr>)
            const newRow = document.createElement("tr");

            // 2. Create table data cells (<td>) for each input value
            const nameCell = document.createElement("td");
            nameCell.textContent = name;

            const cityCell = document.createElement("td");
            cityCell.textContent = city;

            const ageCell = document.createElement("td");
            ageCell.textContent = age;

            // 3. Append the cells to the new row
            newRow.appendChild(nameCell);
            newRow.appendChild(cityCell);
            newRow.appendChild(ageCell);

            // 4. Append the new row to the table body
            tableBody.appendChild(newRow);

            // 5. Clear the form fields after successful submission
            clearFields();
        }

        // Add an event listener to the submit button to call displayData
        submitButton.addEventListener("click", displayData);
   
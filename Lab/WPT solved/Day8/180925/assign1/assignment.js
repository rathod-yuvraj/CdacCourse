$(document).ready(function() {
            // When the button is clicked
            $('#loadDataButton').click(function() {
                $.ajax({
                    url: 'data.txt',  // URL of the text file (assuming it's in the same directory)
                    type: 'GET',  // HTTP method to retrieve data
                    success: function(data) {
                        // Display the content of the text file inside the #content div
                        $('#content').html('<pre>' + data + '</pre>');
                    },
                    error: function(xhr, status, error) {
                        // In case of error
                        $('#content').html('Error loading data.');
                    }
                });
            });
        });
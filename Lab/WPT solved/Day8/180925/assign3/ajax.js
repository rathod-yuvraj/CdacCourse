$(document).ready(function() {
            // Fetch data based on ID entered by the user
            $('#loadPostButton').click(function() {
                const postId = $('#postId').val();  // Get the entered ID
                
                if (postId) {
                    $.ajax({
                        url: `https://jsonplaceholder.typicode.com/posts/${postId}`,
                        type: 'GET',
                        success: function(data) {
                            // Empty the table body before appending new data
                            $('#postDetailTable tbody').empty();

                            // Create a new row with the data from the API
                          const row = '<tr>' +
             '<td>' + data.id + '</td>' +
             '<td>' + data.title + '</td>' +
             '<td>' + data.body + '</td>' +
             '</tr>';
;
                            $('#postDetailTable tbody').append(row);
                        },
                        error: function(xhr, status, error) {
                            // Handle errors (e.g., invalid ID)
                            alert('Error: Post not found or invalid ID!');
                        }
                    });
                } else {
                    alert('Please enter a valid Post ID!');
                }
            });
        });
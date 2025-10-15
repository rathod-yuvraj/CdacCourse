$(document).ready(function() {

    // Add class to the element
    $('#addClassBtn').click(function() {
        $('#box').addClass('box-highlight');
    });

    // Remove class from the element
    $('#removeClassBtn').click(function() {
        $('#box').removeClass('box-highlight');
    });

    // Toggle class (add/remove)
    $('#toggleClassBtn').click(function() {
        console.log("toggle Class Btn click");
        $('#box').toggleClass('box-small');
    });

});

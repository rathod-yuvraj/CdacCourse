function updateClock() {
    const now = new Date();  // get current time
    
    // Extract hours, minutes, seconds
    let hours = now.getHours();
    let minutes = now.getMinutes();
    let seconds = now.getSeconds();
    
    // Format time as two digits (e.g. 08 instead of 8)
    hours = hours < 10 ? '0' + hours : hours;
    minutes = minutes < 10 ? '0' + minutes : minutes;
    seconds = seconds < 10 ? '0' + seconds : seconds;
    
    // Combine into a string
    const currentTime = `${hours}:${minutes}:${seconds}`;
    

    document.getElementById('clock').textContent = currentTime;
}

// Run updateClock every second
setInterval(updateClock, 1000);


updateClock();

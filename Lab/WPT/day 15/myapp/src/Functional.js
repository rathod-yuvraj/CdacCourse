    useEffect(() => {
      // This code runs once after the initial render
      console.log("Component mounted!");
      // Example: Fetch data
      fetchData();
    }, []); // Empty dependency array

        useEffect(() => {
      const timer = setInterval(() => {
        console.log("Interval running...");
      }, 1000);

      return () => {
        // This cleanup function runs when the component unmounts
        // or before the next effect run if dependencies change
        clearInterval(timer);
        console.log("Interval cleared!");
      };
    }, []);y
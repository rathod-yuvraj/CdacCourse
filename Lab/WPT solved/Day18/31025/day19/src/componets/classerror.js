import React, { Component } from "react";

class ErrorBoundary extends Component {
  constructor(props) {
    super(props);
    this.state = { hasError: false, errorMessage: "" };
  }

  // Update state so next render shows fallback UI
  static getDerivedStateFromError(error) {
    return { hasError: true, errorMessage: error.toString() };
  }

  // Log the error details
  componentDidCatch(error, errorInfo) {
    console.error("Error caught by ErrorBoundary:", error, errorInfo);
  }

  render() {
    if (this.state.hasError) {
      // Fallback UI
      return (
        <div style={{ padding: "20px", color: "red", textAlign: "center" }}>
          <h2>Something went wrong 😢</h2>
          <p>{this.state.errorMessage}</p>
        </div>
      );
    }

    return this.props.children;
  }
}

export default ErrorBoundary;

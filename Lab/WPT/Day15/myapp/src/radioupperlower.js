import React, { useState } from "react";

function TextCaseConverter() {
  const [text, setText] = useState("");
  const [caseType, setCaseType] = useState("uppercase");

  // Function to convert text based on selected case type
  function convertText(input, type) {
    switch (type) {
      case "uppercase":
        return input.toUpperCase();
      case "lowercase":
        return input.toLowerCase();
      case "titlecase":
        return input
          .toLowerCase()
          .split(" ")
          .map(word => word.charAt(0).toUpperCase() + word.slice(1))
          .join(" ");
      default:
        return input;
    }
  }

  return (
    <div>
      <h3>Text Case Converter</h3>
      <input
        type="text"
        placeholder="Enter text here"
        value={text}
        onChange={(e) => setText(e.target.value)}
      />
      <div>
        <label>
          <input
            type="radio"
            value="uppercase"
            checked={caseType === "uppercase"}
            onChange={(e) => setCaseType(e.target.value)}
          />
          Uppercase
        </label>
        <label>
          <input
            type="radio"
            value="lowercase"
            checked={caseType === "lowercase"}
            onChange={(e) => setCaseType(e.target.value)}
          />
          Lowercase
        </label>
        <label>
          <input
            type="radio"
            value="titlecase"
            checked={caseType === "titlecase"}
            onChange={(e) => setCaseType(e.target.value)}
          />
          Title Case
        </label>
      </div>
      <p>
        Converted Text: <strong>{convertText(text, caseType)}</strong>
      </p>
    </div>
  );
}

export default TextCaseConverter;

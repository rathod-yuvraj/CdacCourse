import React from 'react';
class CaseConverter extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      text: ''
    };
  }
  handleInputChange = (event) => {
    this.setState({ text: event.target.value });
  };
  handleUpperCase = () => {
    const upperCaseText = this.state.text.toUpperCase();
    console.log('UPPERCASE:', upperCaseText);
  };
  handleLowerCase = () => {
    const lowerCaseText = this.state.text.toLowerCase();
    console.log('lowercase:', lowerCaseText);
  };
} 
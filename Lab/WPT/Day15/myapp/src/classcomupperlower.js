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
<<<<<<< HEAD
<<<<<<< HEAD
} 
=======
} npx
>>>>>>> 32558f955f463af33c75ee82b0c9ba8fe2153e5a
=======
} npx
=======
} 
>>>>>>> ra
>>>>>>> yuvraj

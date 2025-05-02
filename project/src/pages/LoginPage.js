import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom'; // <-- Import useNavigate
import './LoginPage.css';

const LoginPage = ({ setUsername }) => {
  const [name, setName] = useState('');
  const navigate = useNavigate(); // <-- Initialize navigate

  const handleLogin = () => {
    if (name.trim()) {
      setUsername(name);
      navigate('/skill-assessment'); // <-- Redirect to SkillForm
    } else {
      alert("Please enter your name");
    }
  };

  return (
    <div className="login-page">
      <div className="login-page__left-section">
        <div className="company-name">KarmaCareer</div>
        <div className="login-page__login-description">
          Welcome to <strong>KarmaCareer</strong> – your personalized career guidance platform.
          Discover the best courses based on your skill strengths, and receive smart job role predictions tailored just for you.
        </div>
      </div>

      <div className="vertical-line"></div>

      <div className="login-page__right-section">
        <div className="login-page__login-box">
          <h2>Login</h2>
          <input
            className="login-page__input-field"
            type="text"
            placeholder="Enter your name"
            value={name}
            onChange={(e) => setName(e.target.value)}
          />
          <button className="login-page__button" onClick={handleLogin}>Login</button>
        </div>
      </div>
    </div>
  );
};

export default LoginPage;

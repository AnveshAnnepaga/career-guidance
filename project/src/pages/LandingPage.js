import React from 'react';
import { useNavigate } from 'react-router-dom';
import './LandingPage.css';

const LandingPage = () => {
  const navigate = useNavigate();

  return (
    <div className="landing-container">
      <h1 className="fade-in">Welcome to the Career Guidance App</h1>
      <p className="fade-in">This app helps you find the best courses based on your interests and self-assessed skill levels.</p>
      <button className="animated-btn" onClick={() => navigate('/login')}>Get Started</button>
    </div>
  );
};

export default LandingPage;

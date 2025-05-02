import React, { useState } from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import SkillForm from './components/SkillForm';
import RecommendationPage from './pages/RecommendationPage';
import LandingPage from './pages/LandingPage';
import LoginPage from './pages/LoginPage';
import './App.css';

function App() {
  const [username, setUsername] = useState('');
  const [userRatings, setUserRatings] = useState(null);

  return (
    <Router>
      <Routes>
        <Route path="/" element={<LandingPage />} />
        <Route path="/login" element={<LoginPage setUsername={setUsername} />} />
        <Route path="/skill-assessment" element={<SkillForm username={username} setUserRatings={setUserRatings} />} />
        <Route path="/recommendations" element={<RecommendationPage userRatings={userRatings} />} />
      </Routes>
    </Router>
  );
}

export default App;

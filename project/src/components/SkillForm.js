import React, { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import './SkillForm.css';
import logo from '../assets/images/logo.png'; // Ensure the path to your logo is correct

const SkillForm = ({ username }) => {
  const navigate = useNavigate();

  const initialSkills = {
    ai_ml: '',
    data_science: '',
    business_analyst: '',
    cyber_security: '',
    database_administrator: '',
    database_fundamentals: '',
    computer_architecture: '',
    software_development: '',
    programming_skills: '',
    project_management: '',
    technical_communication_skills: '',
    distributed_computer_systems: '',
    computer_network: '',
    computer_forensic: ''
  };

  const [ratings, setRatings] = useState(initialSkills);
  const [selectedCount, setSelectedCount] = useState(0);
  const [selectionError, setSelectionError] = useState('');

  const handleChange = (skill, value) => {
    const isSelecting = value === 'Select';
    const wasSelected = ratings[skill] === 'Select';

    if (isSelecting && selectedCount >= 3 && !wasSelected) {
      setSelectionError('You can select a maximum of 3 courses.');
      return; // Prevent the selection
    } else {
      setSelectionError(''); // Clear any previous error
      setSelectedCount(prevCount => (isSelecting && !wasSelected ? prevCount + 1 : (wasSelected && !isSelecting ? prevCount - 1 : prevCount)));
      setRatings({ ...ratings, [skill]: value });
    }
  };

  const handleSubmit = () => {
    const selectedSkills = Object.keys(ratings).filter(
      key => ratings[key] === 'Select'
    );

    if (selectedSkills.length > 0 && selectedSkills.length <= 3) {
      sessionStorage.setItem('selectedSkills', JSON.stringify(selectedSkills));
      navigate('/recommendations');
    } else if (selectedSkills.length === 0) {
      setSelectionError('Please select at least one course.');
    } else if (selectedSkills.length > 3) {
      setSelectionError('You have selected more than 3 courses. Please select up to 3.');
    }
  };

  const ratingOptions = ['Select'];
  const skillLabels = {
    ai_ml: 'AI ML',
    data_science: 'Data Science',
    business_analyst: 'Business Analyst',
    cyber_security: 'Cyber Security',
    database_administrator: 'Database Administrator',
    database_fundamentals: 'Database Fundamentals',
    computer_architecture: 'Computer Architecture',
    software_development: 'Software Development',
    programming_skills: 'Programming Skills',
    project_management: 'Project Management',
    technical_communication_skills: 'Technical Communication Skills',
    distributed_computer_systems: 'Distributed Computer Systems',
    computer_network: 'Computer Network',
    computer_forensic: 'Computer Forensic'
  };

  return (
    <div className="skill-form-container">
      <div className="top-bar">
        <span className="greeting">Hi! {username}</span>
        <div className="logo-container">
          <img src={logo} alt="App Logo" />
        </div>
      </div>
      <h2 className="form-title">Select Your Skills</h2>
      <div className="app-info">
        <p className="app-description">
          Discover your ideal learning path! Rate your skills to get personalized course recommendations tailored to your potential and career aspirations. Start exploring your growth today!
        </p>
      </div>
      {selectionError && <p className="error-message">{selectionError}</p>}
      <div className="skills-grid">
        {Object.keys(ratings).map(skill => (
          <div key={skill} className="skill-rating">
            <label htmlFor={skill}>{skillLabels[skill]}</label>
            <select
              id={skill}
              value={ratings[skill]}
              onChange={(e) => handleChange(skill, e.target.value)}
            >
              <option value="">Choose your option</option>
              {ratingOptions.map(option => (
                <option key={option} value={option}>{option}</option>
              ))}
            </select>
          </div>
        ))}
      </div>

      <button className="submit-button" onClick={handleSubmit}>
        Get Personalized Recommendations
      </button>
    </div>
  );
};

export default SkillForm;
import React from 'react';
import ReactDOM from 'react-dom/client'; // Import from react-dom/client
import './index.css';  // If you are using this for styles
import App from './App';

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>
);

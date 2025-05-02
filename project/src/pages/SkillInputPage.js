import React from 'react';
import SkillForm from '../components/SkillForm';

const SkillInputPage = ({ setUserRatings }) => {
  return (
             <div className="page-container">
               <header className="header">
                 <h2>Career Guidance System</h2>
                 <span className="user-greeting">Hi! {userName}</span>
               </header>

               <section>
                 <p>
                   Based on your ratings, we’ll recommend personalized courses and suitable job roles.
                 </p>
               </section>

               <section>
                 <SkillForm />
               </section>
             </div>
           );
};

export default SkillInputPage;
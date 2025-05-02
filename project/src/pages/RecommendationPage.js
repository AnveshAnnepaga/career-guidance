import React, { useEffect, useState } from 'react';
import CourseList from '../components/CourseList';
import CourseDetail from '../components/CourseDetail';
import './RecommendationPage.css';

const RecommendationPage = () => {
  const [recommendedCourses, setRecommendedCourses] = useState([]);
  const [selectedSkills, setSelectedSkills] = useState([]);
  const [selectedCourse, setSelectedCourse] = useState(null);

  useEffect(() => {
    const skillsFromStorage = JSON.parse(sessionStorage.getItem('selectedSkills') || '[]');
    setSelectedSkills(skillsFromStorage);
    if (Array.isArray(skillsFromStorage) && skillsFromStorage.length > 0) {
      fetch('http://localhost:8081/api/recommendations', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ selectedSkills: skillsFromStorage })
      })
        .then(res => {
          if (!res.ok) {
            throw new Error('Failed to fetch recommendations');
          }
          return res.json();
        })
        .then(data => {
          setRecommendedCourses(data);
          sessionStorage.setItem('recommendedCourses', JSON.stringify(data));
        })
        .catch(err => console.error('Error fetching recommendations:', err));
    }
  }, []);

  const handleCourseSelect = (course) => {
    setSelectedCourse(course);
  };

  const handleGoBack = () => {
    setSelectedCourse(null);
  };

  if (selectedCourse) {
    return <CourseDetail course={selectedCourse} onGoBack={handleGoBack} />;
  }

  return (
    <div className="max-w-4xl mx-auto p-6">
      <h2 className="text-2xl font-bold mb-4 text-center">Recommended Courses</h2>

      {/* ✅ Show selected skills */}
      {selectedSkills.length > 0 && (
        <div className="mb-6 text-center">
          <h3 className="text-lg font-semibold">Skills You Selected:</h3>
          <p className="text-gray-700">{selectedSkills.join(', ')}</p>
        </div>
      )}

      {recommendedCourses.length === 0 ? (
        <p className="text-center text-gray-600">
          No matching course recommendations found for your selected skills. Please try again with different skills.
        </p>
      ) : (
        <div>
          <p className="text-center text-gray-700 mb-4">
            Based on your recommendation, below are the details of the courses.
          </p>
          <CourseList
            courses={recommendedCourses}
            onCourseSelect={handleCourseSelect}
            suitableCourses={recommendedCourses}
          />
        </div>
      )}
    </div>
  );
};

export default RecommendationPage;

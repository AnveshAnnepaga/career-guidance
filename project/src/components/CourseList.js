import React, { useState, useRef } from 'react';
import './CourseList.css'; // Import the CSS
import { useNavigate } from 'react-router-dom'; // Import useNavigate

const CourseList = ({ courses, userRatings, onRatingChange, onCourseSelect, suitableCourses }) => {
  const navigate = useNavigate(); // Initialize useNavigate
  const ratingOptions = ['Select'];
  const containerRef = useRef(null);
  const [startIndex, setStartIndex] = useState(0);
  const coursesPerPage = 1; // Display one course at a time

  const nextCourse = () => {
    if (startIndex + coursesPerPage < suitableCourses.length) {
      setStartIndex(startIndex + coursesPerPage);
    }
  };

  const prevCourse = () => {
    if (startIndex > 0) {
      setStartIndex(startIndex - coursesPerPage);
    }
  };

  const goToSkillForm = () => {
    navigate('/skill-assessment'); // Navigate to the /skill-assessment route
  };

  const visibleCourses = suitableCourses.slice(startIndex, startIndex + coursesPerPage);

  return (
    <div className="max-w-4xl mx-auto">
      {/* Rating Section (if applicable) */}
      {userRatings && Object.keys(userRatings).length > 0 && (
        <div className="bg-white rounded-lg shadow-lg p-6 mb-8">
          <h2 className="text-2xl font-semibold mb-4">Rate Your Skills</h2>
          {/* ... rating form ... */}
        </div>
      )}

      {/* Recommendations Section */}
      {suitableCourses && suitableCourses.length > 0 && (
        <div className="bg-white rounded-lg shadow-lg p-6">
          <div className="recommendation-header-cl"> {/* New container in CourseList */}
            <h2 className="text-2xl font-semibold mb-4">Recommended Courses</h2>
            <button className="header-button-cl" onClick={goToSkillForm}> {/* Correct class applied here */}
              Back to Select Skills
            </button>
          </div>
          <div className="course-list-wrapper">
            <div className="course-list-container" ref={containerRef}>
              {visibleCourses.map(course => (
                <div
                  key={course.id}
                  className="course-item hover:bg-gray-50 cursor-pointer"
                  onClick={() => onCourseSelect(course)}
                >
                  <h3 className="course-item-title">{course.name}</h3>
                  <div className="course-item-section">
                    <h4 className="resource-heading">Overview</h4>
                    <p className="course-item-description">{course.description}</p>
                  </div>
                  {course.resources && course.resources.courseLink && (
                    <div className="course-item-section">
                      <h4 className="resource-heading">Access Course</h4>
                      <a
                        href={course.resources.courseLink}
                        target="_blank"
                        rel="noopener noreferrer"
                        className="course-item-link"
                      >
                        Access Course
                      </a>
                    </div>
                  )}
                  {course.resources && course.resources.youtubeLinks && course.resources.youtubeLinks.length > 0 && (
                    <div className="course-item-section">
                      <h4 className="resource-heading">Tutorial Videos</h4>
                      <ul>
                        {course.resources.youtubeLinks.map((link, index) => (
                          <li key={index}>
                            <a
                              href={link}
                              target="_blank"
                              rel="noopener noreferrer"
                              className="course-item-link"
                            >
                              Video {index + 1}
                            </a>
                          </li>
                        ))}
                      </ul>
                    </div>
                  )}
                  {course.resources && course.resources.materials && course.resources.materials.length > 0 && (
                    <div className="course-item-section">
                      <h4 className="resource-heading">Materials</h4>
                      <ul className="course-item-materials-list">
                        {course.resources.materials.map((material, index) => (
                          <li key={index}>{material}</li>
                        ))}
                      </ul>
                    </div>
                  )}
                </div>
              ))}
            </div>
            {suitableCourses.length > coursesPerPage && (
              <div className="course-navigation-buttons">
                <button onClick={prevCourse} disabled={startIndex === 0}>
                  Previous
                </button>
                <button onClick={nextCourse} disabled={startIndex + coursesPerPage >= suitableCourses.length}>
                  Next
                </button>
              </div>
            )}
          </div>
          {/* Removed the extra button here as it's now in the header */}
        </div>
      )}

      {/* No Recommendations Message */}
      {suitableCourses && suitableCourses.length === 0 && (
        <div className="bg-white rounded-lg shadow-lg p-6">
          <div className="recommendation-header-cl"> {/* Using the same header style */}
            <h2 className="text-2xl font-semibold mb-4">Recommended Courses</h2>
            <button className="centered-button-cl" onClick={goToSkillForm}> {/* Using centered style here */}
              Back to Select Skills
            </button>
          </div>
          <p className="text-gray-600">Based on your recommendation , below is the details of the courses.</p>
        </div>
      )}
    </div>
  );
};

export default CourseList;
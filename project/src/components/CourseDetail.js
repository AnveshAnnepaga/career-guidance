import React from 'react';
import './CourseDetail.css'; // Keep this for the overall layout
import './CourseList.css'; // Import CourseList.css for link styles

const CourseDetail = ({ course, onGoBack }) => {
  if (!course) return <div>Loading...</div>;

  const {
    name = 'No course name available',
    description = 'No description available',
    topics = [],
    resources = {}
  } = course;

  const {
    courseLink = '',
    youtubeLinks = [], // This should contain an array of 5 YouTube links
    materials = []
  } = resources;

  const handleCourseLinkClick = (link) => {
    window.open(link, '_blank'); // Opens the course link in a new tab
  };

  const handleVideoClick = (link) => {
    window.open(link, '_blank'); // Opens the YouTube link in a new tab
  };

  return (
    <div className="course-detail-container">
      <h2 className="course-title">{name}</h2>

      <div className="section">
        <h3 className="section-title">Overview</h3>
        <p className="section-content">{description}</p>
      </div>

      <div className="section">
        <h3 className="section-title">Key Topics</h3>
        <ul className="topics-list">
          {topics.length > 0 ? (
            topics.map((topic, idx) => <li key={idx} className="topic-item">{topic}</li>)
          ) : (
            <p>No topics available.</p>
          )}
        </ul>
      </div>

      <div className="section">
        <h3 className="section-title">Access Course</h3>
        {courseLink ? (
          <p>
            <a
              href={courseLink}
              target="_blank"
              rel="noopener noreferrer"
              className="course-item-link" // Apply the course-item-link class
            >
              Access Course
            </a>
          </p>
        ) : (
          <p>No course link available.</p>
        )}
      </div>

      <div className="section">
        <h3 className="section-title">Tutorial Videos</h3>
        <div>
          {youtubeLinks.length > 0 ? (
            <ul>
              {youtubeLinks.map((link, index) => (
                <li key={index}>
                  <a
                    href={link}
                    target="_blank"
                    rel="noopener noreferrer"
                    className="course-item-link" // Apply the course-item-link class
                  >
                    Video {index + 1}
                  </a>
                </li>
              ))}
            </ul>
          ) : (
            <p>No tutorial videos available.</p>
          )}
        </div>
      </div>

      <div className="section">
        <h3 className="section-title">Materials</h3>
        {materials.length > 0 ? (
          <ul className="materials-list">
            {materials.map((m, i) => <li key={i}>{m}</li>)}
          </ul>
        ) : (
          <p>No additional materials available.</p>
        )}
      </div>

      <button onClick={onGoBack} className="back-button">Back</button>
    </div>
  );
};

export default CourseDetail;
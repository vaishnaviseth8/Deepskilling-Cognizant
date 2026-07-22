import React, { useEffect, useState } from 'react';
import '../Stylesheets/mystyle.css';

export const CalculateScore = () => {
  const [student, setStudent] = useState(null);

  useEffect(() => {
    fetch('http://localhost:8080/api/student')
      .then(res => res.json())
      .then(data => setStudent(data));
  }, []);

  if (!student) return <div>Loading...</div>;

  const percentToDecimal = (decimal) => (decimal.toFixed(2) + '%');
  const score = percentToDecimal(student.total / student.goal);

  return (
    <div className="formatstyle">
      <h1><font color="Brown">Student Details:</font></h1>
      <div className="Name"><b><span>Name: </span></b><span>{student.name}</span></div>
      <div className="School"><b><span>School: </span></b><span>{student.school}</span></div>
      <div className="Total"><b><span>Total: </span></b><span>{student.total} Marks</span></div>
      <div className="Score"><b>Score: </b><span>{score}</span></div>
    </div>
  );
};

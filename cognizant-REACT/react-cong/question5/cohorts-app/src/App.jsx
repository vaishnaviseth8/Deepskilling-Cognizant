import "./App.css";
import CohortCard from "./components/CohortCard";

function App() {

  const cohorts = [
    {
      title: "INTADMDF10 - .NET FSD",
      startedOn: "22-Feb-2022",
      currentStatus: "Scheduled",
      coach: "Athma",
      trainer: "Ijo Jose"
    },
    {
      title: "ADM21JF014 - Java FSD",
      startedOn: "10-Sep-2021",
      currentStatus: "Ongoing",
      coach: "Apoorv",
      trainer: "Elisa Smith"
    },
    {
      title: "CDBJF21025 - Java FSD",
      startedOn: "24-Dec-2021",
      currentStatus: "Ongoing",
      coach: "Athma",
      trainer: "John Doe"
    }
  ];

  return (
    <div className="container">

      <h2>Cohorts Details</h2>

      <div className="cards">

        {cohorts.map((cohort, index) => (
          <CohortCard
            key={index}
            data={cohort}
          />
        ))}

      </div>

    </div>
  );
}

export default App;
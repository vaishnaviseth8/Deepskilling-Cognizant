import "./App.css";
import officeImg from "./assets/office.jpg";

function App() {

  const offices = [

    {
      name: "DBS",
      rent: 50000,
      address: "Chennai",
      image: officeImg
    },

    {
      name: "TCS",
      rent: 75000,
      address: "Bangalore",
      image: officeImg
    },

    {
      name: "Infosys",
      rent: 45000,
      address: "Hyderabad",
      image: officeImg
    }

  ];

  return (

    <div>

      <h1>Office Space , at Affordable Range</h1>

      {offices.map((office, index) => (

        <div key={index} className="card">

          <img
            src={office.image}
            alt="Office Space"
            width="250"
            height="170"
          />

          <h2>Name: {office.name}</h2>

          <h3
            style={{
              color: office.rent < 60000 ? "red" : "green"
            }}
          >
            Rent Rs. {office.rent}
          </h3>

          <h3>
            Address: {office.address}
          </h3>

        </div>

      ))}

    </div>

  );

}

export default App;
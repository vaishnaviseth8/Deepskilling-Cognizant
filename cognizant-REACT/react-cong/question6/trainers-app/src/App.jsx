import "./App.css";

import { BrowserRouter, Routes, Route, Link } from "react-router-dom";

import Home from "./components/Home";
import TrainersList from "./components/TrainersList";
import TrainerDetails from "./components/TrainerDetails";

import trainersMock from "./TrainersMock";

function App() {
  return (
    <BrowserRouter>

      <div className="container">

        <h1>My Academy Trainers App</h1>

        <Link to="/">Home</Link>

        {" | "}

        <Link to="/trainers">Show Trainers</Link>

        <hr />

        <Routes>

          <Route path="/" element={<Home />} />

          <Route
            path="/trainers"
            element={<TrainersList trainers={trainersMock} />}
          />

          <Route
            path="/trainers/:id"
            element={<TrainerDetails />}
          />

        </Routes>

      </div>

    </BrowserRouter>
  );
}

export default App;
import styles from "./CohortCard.module.css";

function CohortCard({ data }) {

  return (
    <div className={styles.box}>

      <h3
        className={
          data.currentStatus === "Ongoing"
            ? styles.green
            : styles.blue
        }
      >
        {data.title}
      </h3>

      <p>
        <strong>Started On</strong><br />
        {data.startedOn}
      </p>

      <p>
        <strong>Current Status</strong><br />
        {data.currentStatus}
      </p>

      <p>
        <strong>Coach</strong><br />
        {data.coach}
      </p>

      <p>
        <strong>Trainer</strong><br />
        {data.trainer}
      </p>

    </div>
  );
}

export default CohortCard;
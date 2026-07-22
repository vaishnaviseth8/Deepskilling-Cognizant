const API="http://localhost:8080/api";
export const getMessage=(path)=>fetch(`${API}/${path}`).then(r=>r.text());

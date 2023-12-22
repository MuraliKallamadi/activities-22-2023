import axios from "axios";
import { useState, useEffect } from "react";
import { Route, Routes, Link, useNavigate, useParams } from "react-router-dom";
let BASE_URL = "http://localhost:9091/api/login";


export function Login() {
  let [mail, setMail] = useState("");
  let [pass, setPass] = useState("");
  let [error, setError] = useState(""); //if profile not found set this error
  let [message, setMessage] = useState("");
  let [suc_message, setSucMessage] = useState("");
  let loginBymail = (e) => {
    e.preventDefault();
    axios
      .get(BASE_URL + "/getCustomer/" + mail)
      .then((res) => {
        res.data.password == pass
          ? setSucMessage("Success")
          : setMessage("Invalid Password/Mail ID Please Check !!");
        setMail("");
        setPass("");
      })
      .catch((e) => {
        setMail("");
        setPass("");
        setError(e);
      });
  };
  return (
    <div>
      <h2 style={{ textAlign: "center" }}>Login Here</h2>
      <br />
      <form onSubmit={loginBymail}>
        <div className="container-fluid">
          <div className="w-25">
            <input
              type="text"
              className="form-control"
              autoComplete="off"
              placeholder="Enter Email Id"
              value={mail}
              onChange={(e) => setMail(e.target.value)}
              style={{ marginLeft: 480 }}
            ></input>
          </div>
          <br />
          <div className="w-25">
            <input
              type="password"
              autoComplete="off"
              className="form-control"
              placeholder="Enter Password"
              value={pass}
              onChange={(e) => setPass(e.target.value)}
              style={{ marginLeft: 480 }}
            ></input>
          </div>
          <br />
          <div>
            <input
              type="submit"
              value="Login"
              className="btn btn-danger"
              style={{ marginLeft: 550, width: 180 }}
            ></input>
          </div>
          <br />
          <div className="text-center">
            {message != "" ? <p className="text-danger">{message}</p> : <p></p>}
            {suc_message != "" ? (
              <p className="text-success">{suc_message}</p>
            ) : (
              <p></p>
            )}
          </div>
        </div>
      </form>
    </div>
  );
}
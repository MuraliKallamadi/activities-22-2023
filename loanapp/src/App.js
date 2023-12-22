import logo from "./logo.svg";
import "./App.css";
import { Ribbon } from "./Components/Ribbon";
import { Login } from "./Components/Login";
import { Registration } from "./Components/Registration";

function App() {
  return (
    <div>
      <Ribbon />
      <Registration />
    </div>
  );
}

export default App;

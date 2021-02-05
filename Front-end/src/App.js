import React from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import './App.css';
import {BrowserRouter as Router,Route,Switch} from 'react-router-dom'
import ListEmployeesComponent from "./components/ListEmployeesComponent";
import HeaderComponent from "./components/HeaderComponent";
import FooterComponent from "./components/FooterComponent";
import MainComponent from "./components/MainComponent";
import LoginComponent from "./components/LoginComponent";

function App() {
  return (
    <div>
    <Router>
     <HeaderComponent/>
                <div className="container">
                  <Switch>
                      <Route path ="/" exact component = {LoginComponent}></Route> 
                      <Route path = "/home"  component = {MainComponent}></Route>
                      <Route path = "/employees" component = {ListEmployeesComponent}></Route>   
                  </Switch>
                </div>
     <FooterComponent/>   
    </Router>
    </div> 
  );
}

export default App;

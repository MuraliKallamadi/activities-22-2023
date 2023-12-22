
import React, { useState } from "react";


export function RegistrationForm(){
    let [firstname, setFirstName] = useState('');
    let [lastname,setLastName] = useState('');
    let [email_id, setEmail_Id] = useState('');
    let [password,setPassword] = useState('');
    let [pan, setPan] = useState('');
    let [phone,setPhone] = useState('');
    let handleSubmit = (e) =>{
        //when u submit the form, by default it reloads the browser, we must prevent that
        e.preventDefault();
        setFirstName('');
        setLastName('');
        setEmail_Id('');
        setPassword('');
        setPan('');
        setPhone('');
    }
    return (<div className="w-25">
        <h2>Registration Form</h2>
        <form onSubmit={handleSubmit}>
            <div>
                FirstName
                <input type="text" autoComplete="off"  value ={firstname} 
                className='form-control' onChange={(e) => setFirstName(e.target.value)}></input>
            </div>
            <div>
                LastName
                <input type="text" autoComplete="off" value ={lastname}  
                className='form-control' onChange={(e) => setLastName(e.target.value)}></input>
            </div>
            <div>
                Email_ID
                <input type="text" autoComplete="off"  value ={email_id} 
                className='form-control' onChange={(e) => setEmail_Id(e.target.value)}></input>
            </div>
            <div>
                Password
                <input type="text" autoComplete="off" value ={password}  
                className='form-control' onChange={(e) => setPassword(e.target.value)}></input>
            </div>
            <div>
                Pan
                <input type="text" autoComplete="off"  value ={pan} 
                className='form-control' onChange={(e) => setPan(e.target.value)}></input>
            </div>
            <div>
                Phone
                <input type="text" autoComplete="off" value ={phone}  
                className='form-control' onChange={(e) => setPhone(e.target.value)}></input>
            </div>
            <div>
                <input type="register" value ='Register' className="btn btn-primary"></input>
            </div>
        </form>
    </div>)
}
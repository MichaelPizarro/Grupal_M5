CREATE DATABASE prevencion_riesgos;
USE prevencion_riesgos;

-- Tabla "Usuarios"
CREATE TABLE Usuarios (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  contrasenia VARCHAR(100) NOT NULL,
  tipo ENUM('Cliente', 'Administrativo', 'Profesional') NOT NULL
);


-- Tabla "Capacitaciones"
CREATE TABLE Capacitaciones (
  id INT PRIMARY KEY AUTO_INCREMENT,
  rut_cliente VARCHAR(100) NOT NULL,
  dia VARCHAR(100) NOT NULL,
  hora VARCHAR(100) NOT NULL,
  lugar VARCHAR(100) NOT NULL,
  duracion VARCHAR(100) NOT NULL,
  cant_asistentes INT NOT NULL
);

-- Tabla "Visitas"
CREATE TABLE Visitas (
  id INT PRIMARY KEY AUTO_INCREMENT,
  cliente_id INT,
  fecha_visita DATE,
  detalle TEXT,
  profesional_id INT,
  FOREIGN KEY (cliente_id) REFERENCES Usuarios(id),
  FOREIGN KEY (profesional_id) REFERENCES Usuarios(id)
);

-- Tabla "Chequeos"
CREATE TABLE Chequeos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  visita_id INT,
  detalle TEXT,
  estado ENUM('Pendiente', 'Completado'),
  FOREIGN KEY (visita_id) REFERENCES Visitas(id)
);

-- Tabla "Pagos"
CREATE TABLE Pagos (
  id INT PRIMARY KEY AUTO_INCREMENT,
  cliente_id INT,
  monto DECIMAL(10,2),
  fecha_pago DATE,
  FOREIGN KEY (cliente_id) REFERENCES Usuarios(id)
);

-- Tabla "Asesorias"
CREATE TABLE Asesorias (
  id INT PRIMARY KEY AUTO_INCREMENT,
  nombre VARCHAR(100) NOT NULL,
  detalle TEXT,
  profesional_id INT,
  FOREIGN KEY (profesional_id) REFERENCES Usuarios(id)
);

-- Tabla "Accidentes"
CREATE TABLE Accidentes (
  id INT PRIMARY KEY AUTO_INCREMENT,
  cliente_id INT,
  fecha_accidente DATE,
  detalle TEXT,
  FOREIGN KEY (cliente_id) REFERENCES Usuarios(id)
);

-- Tabla "Asistentes"
CREATE TABLE Asistentes (
  capacitacion_id INT,
  usuario_id INT,
  FOREIGN KEY (capacitacion_id) REFERENCES Capacitaciones(id),
  FOREIGN KEY (usuario_id) REFERENCES Usuarios(id),
  PRIMARY KEY (capacitacion_id, usuario_id)
);
